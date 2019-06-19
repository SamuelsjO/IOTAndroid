package com.example.energysmart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import org.eclipse.paho.android.service.MqttAndroidClient;
import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttToken;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;

public class MainActivity extends AppCompatActivity {

    static String MQTTHOST = "tcp://m16.cloudmqtt.com:10130";
    static String USERNAME = "vojlyjoj";
    static String PASSWORD = "Tz94RU1KDTwV";
    String topicStr = "SALA";
    String topicStr2= "QUARTO";
    String topicStr3= "JARDIM";
    String topicStr4= "RGB";
    MqttAndroidClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String clientId = MqttClient.generateClientId();
        client = new MqttAndroidClient(this.getApplicationContext(), MQTTHOST, clientId);
        MqttConnectOptions options = new MqttConnectOptions();
        options.setUserName(USERNAME);
        options.setPassword(PASSWORD.toCharArray());

        try {
            IMqttToken token = client.connect(options);
            token.setActionCallback(new IMqttActionListener() {
                @Override
                public void onSuccess(IMqttToken asyncActionToken) {
                    Toast.makeText(MainActivity.this,"Connected", Toast.LENGTH_LONG).show();
                }

                @Override
                public void onFailure(IMqttToken asyncActionToken, Throwable exception) {
                    Toast.makeText(MainActivity.this,"No connection",Toast.LENGTH_LONG).show();

                }
            });
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }
    public void ligar1(View v){
        String topic = topicStr;
        String message = "L1";
        try {
            client.publish(topic, message.getBytes(),0,false    );
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }
    public void desligar1(View v){
        String topic = topicStr;
        String message = "D1";
        try {
            client.publish(topic, message.getBytes(),0,false    );
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }
    public void ligar2(View v){
        String topic = topicStr2;
        String message = "L2";
        try {
            client.publish(topic, message.getBytes(),0,false    );
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }
    public void desligar2(View v){
        String topic = topicStr2;
        String message = "D2";
        try {
            client.publish(topic, message.getBytes(),0,false    );
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }
    public void ligar3(View v){
        String topic = topicStr3;
        String message = "L3";
        try {
            client.publish(topic, message.getBytes(),0,false    );
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }
    public void desligar3(View v){
        String topic = topicStr3;
        String message = "D3";
        try {
            client.publish(topic, message.getBytes(),0,false    );
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }
    public void ligarB4(View v){
        String topic = topicStr4;
        String message = "B4";
        try {
            client.publish(topic, message.getBytes(),0,false    );
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }
    public void ligarG4(View v){
        String topic = topicStr4;
        String message = "G4";
        try {
            client.publish(topic, message.getBytes(),0,false    );
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }
    public void ligarR4(View v){
        String topic = topicStr4;
        String message = "R4";
        try {
            client.publish(topic, message.getBytes(),0,false    );
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }
    public void desligar4(View v){
        String topic = topicStr4;
        String message = "D4";
        try {
            client.publish(topic, message.getBytes(),0,false    );
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }
}