package com.de.java.clip3.clip12;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalTime;

public class TcpServer {

    public static void main(String[] args){
        ServerSocket serverSocket = null;

        try{
            serverSocket = new ServerSocket(8888);
            System.out.println(LocalTime.now() + " 서버가 준비되었습니다.");

        } catch (Exception e){
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }

        while (true) {

            try{
                System.out.println(LocalTime.now() + " 연결 준비중입니다.");
                Socket socket = serverSocket.accept();
                System.out.println(LocalTime.now() + " 연결 되었습니다.");

                InputStream inputStream = socket.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

                String inputString = bufferedReader.readLine();
                System.out.println(" message : " + inputString);

                OutputStream outputStream = socket.getOutputStream();

                DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
                dataOutputStream.writeUTF("World");
                System.out.println(LocalTime.now() + " 데이터를 전송했습니다.");

                outputStream.close();
                socket.close();

            } catch (Exception e){
                System.out.println(e.getLocalizedMessage());
                e.printStackTrace();
            }
        }

    }
}
