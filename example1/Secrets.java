package com.naveen.example1;


public final class Secrets {
    private String secret[];

    public void storeSecret(String secret) {
        String localVar = secret;
        String hashedSecret[] = new String[3];
        hashedSecret[0] = "***--";
        hashedSecret[1] = localVar;
        hashedSecret[2] = "--***";
        this.secret = hashedSecret
    }

    public String getSecret() {
        return secret;
    }

    public String unsaltSecret(String value) {
        return value.replace("***--", "").replace("--***", "");
    }
}
