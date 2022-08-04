package sast.example1;


public final class Secrets {
    private String secret;

    public void storeSecret(String secret) {
        String localVar = secret;
        this.secret = "***--" + localVar + "--***";
    }

    public String getSecret() {
        return secret;
    }

    public String unsaltSecret(String value) {
        return value.replace("***--", "").replace("--***", "");
    }
}
