/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.hs.http.servtwo;

import com.sun.net.httpserver.*;

import java.io.*;
import java.net.*;
import java.nio.charset.*;
import java.util.logging.*;

public class App {
    public static void main(String[] args) throws IOException {
        App app = new App();
        app.run();

    }

    private void run() throws IOException {
        InetSocketAddress address = new InetSocketAddress(8080);
        HttpServer httpServer = HttpServer.create(address, 0);

        Handler handler;
        httpServer.createContext("/", exchange -> {
            // 1.Request
            String method = exchange.getRequestMethod();
            System.out.println("Method : " + method);

            URI uri = exchange.getRequestURI();
            String path = uri.getPath();
            System.out.println("Path : " + path);

            Headers headers = exchange.getRequestHeaders();
            //Map이라..
            for (String key : headers.keySet()) {
                System.out.println("Headers : " + headers.get(key));
            }

            InputStream body = exchange.getRequestBody();
            byte[] bytes = body.readAllBytes();
            String bodyText = bytes.toString();

//            Reader reader = new InputStreamReader(body);
//            CharBuffer cb = CharBuffer.allocate(1_000_000);
//            reader.read(cb);
            System.out.println("body : " + bodyText);


            // 2.Response
            String content = "Hello, world\n";
            byte[] resBytes = content.getBytes(StandardCharsets.UTF_8);

            exchange.sendResponseHeaders(200, resBytes.length);

            OutputStream outputStream = exchange.getResponseBody();
            outputStream.write(resBytes);
            outputStream.flush();
        });

        httpServer.createContext("/hi", exchange -> {
            String content = "Hi, world\n";
            byte[] resBytes = content.getBytes(StandardCharsets.UTF_8);

            exchange.sendResponseHeaders(200, resBytes.length);

            OutputStream outputStream = exchange.getResponseBody();
            outputStream.write(resBytes);
            outputStream.flush();

        });

        httpServer.start();
    }
}
