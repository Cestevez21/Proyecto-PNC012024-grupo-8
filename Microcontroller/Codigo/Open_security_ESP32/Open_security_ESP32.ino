#include <ESP32Servo.h>
#include <ESP32PWM.h>
#include <WiFi.h>

//definir servos
Servo servoPluma;  
Servo servoPuerta;  
int angulo;
// pin pluma
static const int servoPlumaPin = 17;
// pin pluma
static const int servoPuertaPin = 14;
// internet credentials
const char* ssid = "ssid";
const char* password = "password";

WiFiServer server(80);

//HTTP request
String header;
String valueStringPuerta = String(5);
int posPuerta1 = 0;
int posPuerta2 = 0;
String valueStringPluma = String(5);
int posPluma1 = 0;
int posPluma2 = 0;

//IP estática
IPAddress local_IP(192, 168, 1, 184);
IPAddress gateway(192, 168, 1, 1);
IPAddress subnet(255, 255, 0, 0);
IPAddress primaryDNS(8, 8, 8, 8);
IPAddress secondaryDNS(8, 8, 4, 4);

//tiempo de sesión
unsigned long currentTime = millis();
unsigned long previousTime = 0; 
const long timeoutTime = 4000;

void setup() {
  Serial.begin(115200);
  //Definiendo servos
  servoPluma.attach(servoPlumaPin);
  servoPuerta.attach(servoPuertaPin);  
  // Conexión WiFi
  Serial.print("Connecting to ");
  Serial.println(ssid);
  WiFi.begin(ssid, password);
  while (WiFi.status() != WL_CONNECTED) {
    delay(500);
    Serial.print(".");
  }
  // Configuracion IP estática
  if (!WiFi.config(local_IP, gateway, subnet, primaryDNS, secondaryDNS)) { 
    Serial.println("STA Failed to configure");  }
  // Print IP estática
  Serial.println("");
  Serial.println("WiFi connected.");
  Serial.println("IP address: ");
  Serial.println(WiFi.localIP());
  server.begin();
}

void loop(){
  /*angulo= 0;
  servoPluma.write(angulo); 
  servoPuerta.write(angulo);
  Serial.print("ángulo:  ");
  Serial.println(angulo);
  delay(2000);  

  angulo= 90;
  servoPluma.write(angulo); 
  servoPuerta.write(angulo);
  Serial.print("ángulo:  ");
  Serial.println(angulo);
  delay(2000); 

  angulo= 180;
  servoPluma.write(angulo); 
  servoPuerta.write(angulo);
  Serial.print("ángulo:  ");
  Serial.println(angulo);
  delay(2000);

  angulo= 90;
  servoPluma.write(angulo); 
  servoPuerta.write(angulo);
  Serial.print("ángulo:  ");
  Serial.println(angulo);
  delay(2000);*/
  //Incializar Servidor web
  WiFiClient client = server.available();
   if (client) {
    currentTime = millis();
    previousTime = currentTime
    Serial.println("New Client.");      
    String currentLine = "";
    while (client.connected() && currentTime - previousTime <= timeoutTime) {
      currentTime = millis();
      if (client.available()) {
        char c = client.read();
        Serial.write(c);
        header += c;
        if (c == '\n') {
          if (currentLine.length() == 0) {
            //Print de conexióñ
            client.println("HTTP/1.1 200 OK");
            client.println("Content-type:text/html");
            client.println("Connection: close");
            client.println();
            angulo= 90;
            //Manejo de ruta puerta
            if (header.indexOf("GET /puerta") >= 0) {
              servoPluma.write(angulo);
              Serial.println("puerta abierta");
              delay(2000);
              Serial.println("puerta cerrada");
            }
            //Manejo de ruta pluma
            if (header.indexOf("GET /pluma") >= 0) {
              servoPluma.write(angulo); 
              Serial.println("pluma arriba");
              delay(2000);
              Serial.println("pluma abajo");
            }
            
            client.println();
            break;
          } else {
            currentLine = "";
          }
        } else if (c != '\r') { 
          currentLine += c;
        }
      }
    }
    header = "";
    client.stop();
    Serial.println("Client disconnected.");
    Serial.println("");
  }
}