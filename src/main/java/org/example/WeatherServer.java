package org.example;


import lombok.extern.java.Log;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.server.TServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;

@Log
public class WeatherServer {
    public static void main(String[] args) {
        try {
            WeatherService.Processor<WeatherServiceImpl> processor =
                    new WeatherService.Processor<>(new WeatherServiceImpl());

            TServerTransport serverTransport = new TServerSocket(9090);
            TServer server = new TSimpleServer(new TServer.Args(serverTransport).processor(processor));

            log.info(" WeatherService server started on port 9090...");
            server.serve();
        } catch (Exception e) {
           log.severe(e.getMessage());
        }
    }
}
