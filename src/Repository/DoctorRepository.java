/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Doctor;
import DataAcess.DoctorDAO;
import java.util.ArrayList;

/**
 *
 * @author Xuan Vinh
 */
public class DoctorRepository implements IDoctorRepository{
    @Override
    public void addDoctor(ArrayList<Doctor> ld) {
        DoctorDAO.Instance().addDoctor(ld);
    }

    @Override
    public void updateDoctor(ArrayList<Doctor> ld) {
        DoctorDAO.Instance().updateDoctor(ld);
    }

    @Override
    public void deleteDoctor(ArrayList<Doctor> ld) {
        DoctorDAO.Instance().deleteDoctor(ld);
    }

    @Override
    public void searchDoctor(ArrayList<Doctor> ld) {
        DoctorDAO.Instance().searchDoctor(ld);
    }
}
