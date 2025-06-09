namespace java weather

service WeatherService {
  string getForecast(1:string city),
  double getTemperature(1:string city)
}
