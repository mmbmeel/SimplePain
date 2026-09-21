package br.edu.uemg.simplepaint;

import android.graphics.Color;
import android.graphics.Paint;

public class Estilo {

    public static Paint getEstilosParaLinha(){
        Paint estiloLinha = new Paint();
        estiloLinha.setAntiAlias(true);
        estiloLinha.setColor(Color.MAGENTA);
        estiloLinha.setStyle(Paint.Style.STROKE);
        estiloLinha.setStrokeWidth(10f);
        estiloLinha.setStrokeJoin(Paint.Join.ROUND);
        return estiloLinha;
    }

    public static Paint getEstilosParaLinhaVerde(){
        Paint estiloLinha = new Paint();
        estiloLinha.setAntiAlias(true);
        estiloLinha.setColor(Color.GREEN);
        estiloLinha.setStyle(Paint.Style.STROKE);
        estiloLinha.setStrokeWidth(10f);
        estiloLinha.setStrokeJoin(Paint.Join.ROUND);
        return estiloLinha;
    }

    public static Paint getEstilosParaLinhaRosa(){
        Paint estiloLinha = new Paint();
        estiloLinha.setAntiAlias(true);
        estiloLinha.setColor(Color.rgb(222, 35, 129));
        estiloLinha.setStyle(Paint.Style.STROKE);
        estiloLinha.setStrokeWidth(10f);
        estiloLinha.setStrokeJoin(Paint.Join.ROUND);
        return estiloLinha;
    }

    public static Paint getEstilosParaLinhaVermelha(){
        Paint estiloLinha = new Paint();
        estiloLinha.setAntiAlias(true);
        estiloLinha.setColor(Color.rgb(222, 35, 51));
        estiloLinha.setStyle(Paint.Style.STROKE);
        estiloLinha.setStrokeWidth(10f);
        estiloLinha.setStrokeJoin(Paint.Join.ROUND);
        return estiloLinha;
    }
}
