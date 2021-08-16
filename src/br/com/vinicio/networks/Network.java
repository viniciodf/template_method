package br.com.vinicio.networks;

public abstract class Network {
    String userName;
    String password;

    public boolean post(String message){
        if(logIn(this.userName, this.password)){
            boolean result = sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    abstract boolean logIn(String username, String password);
    abstract boolean sendData(byte[] data);
    abstract void logOut();
}
