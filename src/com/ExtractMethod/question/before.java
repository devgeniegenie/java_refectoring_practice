package com.ExtractMethod.question;

public class before {

    public void processUserRequest() {
        boolean flag;

        //hostname 얻기
        String hostname = null;
        flag = true;
        for (int i = 0; flag && i < 3; i++) {
            showPrompt("Host");
            hostname = getString();
            if (hostname != null) {
                flag = false;
            }
        }
        if (flag) {
            //에러뱉음
        }

        //username 얻기
        String username = null;
        flag = true;
        for (int i = 0; flag && i < 3; i++) {
            showPrompt("User");
            username = getString();
            if (username != null) {
                flag = false;
            }
        }
        if (flag) {
            //에러뱉음
        }

        postRequest(hostname, username);
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
