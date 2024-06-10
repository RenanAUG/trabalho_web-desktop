package Service;

import Model.Cliente;
import Model.Produto;
import Model.Venda;
import Util.Util;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;

import java.net.URL;

public class ApiService {

    private static String urlCliente = "http://localhost:8080/cliente";
    private static String urlProduto = "http://localhost:8080/produto";
    private static String urlVenda = "http://localhost:8080/venda";

    private static int retorno200 = 200;


    public static Cliente buscarCliente() throws Exception{
        try{

            URL url = new URL(urlCliente);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            if(conexao.getResponseCode() != retorno200){
                throw new RuntimeException("Erro: "+conexao.getResponseCode()+" - "+conexao.getResponseMessage());
            }

            BufferedReader res = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
            String json = Util.converteJsonString(res);

            Gson gson = new Gson();
            Cliente cliente = gson.fromJson(json, Cliente.class);

            return cliente;
        }

        catch(IOException | RuntimeException ex){
            throw new Exception("Erro: "+ex.getMessage()+"\n"+ex.getStackTrace());
        }
    }

    public static Produto buscarProduto() throws Exception{

        try{
            URL url = new URL(urlProduto);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

            if(conexao.getResponseCode() != retorno200){
                throw new RuntimeException("Erro: "+conexao.getResponseCode()+" - "+conexao.getResponseMessage());
            }

            BufferedReader res = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
            String json = Util.converteJsonString(res);
            Gson gson = new Gson();
            Produto produto = gson.fromJson(json, Produto.class);

            return produto;
        }
        catch(IOException | RuntimeException ex){
            throw new Exception("Erro: "+ex.getMessage()+"\n"+ex.getStackTrace());
        }
    }

    public static Venda buscarVenda() throws Exception{
        try{
            URL url = new URL(urlVenda);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

            if(conexao.getResponseCode() != retorno200){
                throw new RuntimeException("Erro: "+conexao.getResponseCode()+" - "+conexao.getResponseMessage());
            }

            BufferedReader res = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
            String json = Util.converteJsonString(res);

            Gson gson = new Gson();
            Venda venda = gson.fromJson(json, Venda.class);
            return venda;
        }
        catch(IOException | RuntimeException ex){
            throw new Exception("Erro: "+ex.getMessage()+"\n"+ex.getStackTrace());
        }
    }
}
