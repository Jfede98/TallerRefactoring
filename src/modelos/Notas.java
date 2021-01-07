/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Julian
 */
public class Notas {
    double Nexamen;
    double Nlecc;
    double Ntalleres;
    double Ndeberes;
    Paralelo pa;

    public Notas(double Nexamen, double Nlecc, double Ntalleres, double Ndeberes, Paralelo pa) {
        this.Nexamen = Nexamen;
        this.Nlecc = Nlecc;
        this.Ntalleres = Ntalleres;
        this.Ndeberes = Ndeberes;
    }

    public double getNexamen() {
        return Nexamen;
    }

    public void setNexamen(double Nexamen) {
        this.Nexamen = Nexamen;
    }

    public double getNlecc() {
        return Nlecc;
    }

    public void setNlecc(double Nlecc) {
        this.Nlecc = Nlecc;
    }

    public double getNtalleres() {
        return Ntalleres;
    }

    public void setNtalleres(double Ntalleres) {
        this.Ntalleres = Ntalleres;
    }

    public double getNdeberes() {
        return Ndeberes;
    }

    public void setNdeberes(double Ndeberes) {
        this.Ndeberes = Ndeberes;
    }

    public Paralelo getPa() {
        return pa;
    }

    public void setPa(Paralelo pa) {
        this.pa = pa;
    }
}
