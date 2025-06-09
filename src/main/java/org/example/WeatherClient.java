package org.example;



import lombok.extern.java.Log;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

@Log
public class WeatherClient {
    public static void main(String[] args) {
        try {
            TTransport transport = new TSocket("localhost", 9090);
            transport.open();

            TProtocol protocol = new TBinaryProtocol(transport);
            WeatherService.Client client = new WeatherService.Client(protocol);

           log.info("️ Forecast: " + client.getForecast("Toronto"));
            log.info("🌡 Temperature: " + client.getTemperature("Toronto") + "°C");

            transport.close();
        } catch (Exception e) {
            log.severe(e.getMessage());
        }
    }
}
