package dev.emmanuelotoo;

import java.net.ServerSocket;
import java.nio.charset.StandardCharsets;

public class HttpServerApp {
    public static void main(String[] args) throws Exception  {
        var serverSocket = new ServerSocket(8080);

        while (true) {
            var connection = serverSocket.accept();

            try (var os = connection.getOutputStream()) {
                var json = """
                        {
                            hi im emmanuel
                        }
                        
                        """;

                var response = """
                        HTTP/1.1 200 OK
                        Content-Type: application/json
                        Content-Length: %d
                        
                        %s
                        """.formatted(json.getBytes(StandardCharsets.UTF_8).length, json);

                os.write(response.getBytes(StandardCharsets.UTF_8));
            }
        }
    }
}