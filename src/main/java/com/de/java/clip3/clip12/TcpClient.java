package com.de.java.clip3.clip12;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TcpClient {
    public static void main(String[] args){

        try{
            String serverIp = "localhost";
            System.out.println("서버에 연결합니다");
            System.out.println("서버 IP : " + serverIp);
            Socket socket = new Socket(serverIp, 8888);

            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("Hello\n".getBytes(StandardCharsets.UTF_8));
            outputStream.flush();

            InputStream inputStream = socket.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);

            System.out.println("message from server : " + dataInputStream.readUTF());
            dataInputStream.close();
            socket.close();

            System.out.println("연결이 종료되었습니다.");

        } catch (Exception E){

        }

    }
}
