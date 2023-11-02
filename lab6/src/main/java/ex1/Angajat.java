package ex1;
import java.time.LocalDate;



public class Angajat {
    public String nume,post;
    public LocalDate data_angajarii;
    public Float salariu;
    public Angajat(){}

    public Angajat(String nume, String post, LocalDate data_angajarii, Float salariu) {
        this.nume = nume;
        this.post = post;
        this.data_angajarii = data_angajarii;
        this.salariu = salariu;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public LocalDate getData_angajarii() {
        return data_angajarii;
    }

    public void setData_angajarii(LocalDate data_angajarii) {
        this.data_angajarii = data_angajarii;
    }

    public Float getSalariu() {
        return salariu;
    }

    public void setSalariu(Float salariu) {
        this.salariu = salariu;
    }

    @Override
    public String toString(){
        return nume +","+ post+","+data_angajarii+","+salariu;
    }

}





