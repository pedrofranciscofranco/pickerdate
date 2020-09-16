package com.example.pickerdate;

public class informacion {

    private String Nombredepersona, Fechanacimiento, Telefonodepersona, Emaildepersona, Descripciondepersona;

    public informacion(String nombredepersona, String fechanacimiento, String telefonodepersona, String emaildepersona, String descripciondepersona) {
        Nombredepersona = nombredepersona;
        Fechanacimiento = fechanacimiento;
        Telefonodepersona = telefonodepersona;
        Emaildepersona = emaildepersona;
        Descripciondepersona = descripciondepersona;
    }


    public String getNombredepersona() {
        return Nombredepersona;
    }

    public void setNombredepersona(String nombredepersona) {
        this.Nombredepersona = nombredepersona;
    }

    public String getFechanacimiento() {
        return Fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        Fechanacimiento = fechanacimiento;
    }

    public String getTelefonodepersona() {
        return Telefonodepersona;
    }

    public void setTelefonodepersona(String telefonodepersona) {
        Telefonodepersona = telefonodepersona;
    }

    public String getEmaildepersona() {
        return Emaildepersona;
    }

    public void setEmaildepersona(String emaildepersona) {
        Emaildepersona = emaildepersona;
    }

    public String getDescripciondepersona() {
        return Descripciondepersona;
    }

    public void setDescripciondepersona(String descripciondepersona) {
        Descripciondepersona = descripciondepersona;
    }
}
