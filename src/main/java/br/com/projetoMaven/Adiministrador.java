package br.com.projetoMaven;

public class Adiministrador extends Usuario{

    private Integer idAdm;

    public Integer getIdAdm() {
        return idAdm;
    }//link para chave estrangeira


    public boolean validarAdm(Integer validarAdm){
        if (getId() == getIdAdm()){
            return true;
        }
       else return false;
    }
}
