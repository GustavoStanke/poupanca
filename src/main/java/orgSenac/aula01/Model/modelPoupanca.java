package orgSenac.aula01.Model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class modelPoupanca {
    
    @Id
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "valor", nullable = false)
    private double valor;

    @Column(name = "data", nullable = false)
    private Date data;

    
    public modelPoupanca(int id, double valor, Date data) {
        this.id = id;
        this.valor = valor;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }


}
