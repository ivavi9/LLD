package Singleton;

public class SingletonConnection {

    private static SingletonConnection connection;

    private SingletonConnection(){

    }

    public SingletonConnection getConnection(){
        if(connection == null){

            synchronized (SingletonConnection.class) {
                if (connection == null) {
                    connection = new SingletonConnection();
                }
            }
        }
        return connection;
    }


}
