package Service;

import Model.Cliente;
import Util.Util;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ClienteService {

    private static String URLWEBSERVICE = "http://localhost:8080/cliente";
    private static int SUCESSO = 200;

    public static Cliente buscaEndereco(String cep) throws Exception{
        String urlChamada = URLWEBSERVICE + cep + "/json";

        try{
            URL url = new URL(urlChamada);
            HttpURLConnection conexao =
                    (HttpURLConnection) url.openConnection();

            if(conexao.getResponseCode() != SUCESSO){
                throw new RuntimeException(
                        "Erro ao conectar: "+conexao.getResponseMessage());
            }

            //pegando a resposta da api
            BufferedReader resposta = new BufferedReader(
                    new InputStreamReader(conexao.getInputStream()));

            String json = Util.converteJsonString(resposta);

            Gson gson = new Gson();
            Cliente cliente = gson.fromJson(json, EnderecoDTO.class);

            return cliente;

        }catch(Exception ex){
            throw new Exception("Erro ao retornar endereço: "+ex);
        }

    }
}
