package com.ExtractMethod.question;

public class after {
    
    private final int RETRY = 3;

    public void processUserRequest() {
        String hostname = getHostname("Host");
        String username = getHostname("Username");
        postRequest(hostname, username);
    }

    private String getHostname(String prompt) {
        for (int i = 0; i < RETRY; i++) {
            showPrompt(prompt);
            String input = getString();
            if (input != null) {
                return input;
            }
        }
        return "fail"; //실패
    }


    /**
     * 샘플코드를 위한 임시메서드들
     */
    private String getString() {
        return null;
    }

    private void showPrompt(String host) {
    }

    private void postRequest(String hostname, String username) {
    }
}
