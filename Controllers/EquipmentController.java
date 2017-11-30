package Controllers;

import Dao.EquipmentDao;
import Logica.Equipment;

public class EquipmentController {

    EquipmentDao equipmentDao;

    public EquipmentController(){
        equipmentDao= new EquipmentDao();
    }

    public int addEquipment(String serial, String name, String description, String state){
        Equipment equipment= new Equipment();

        equipment.setSerial(serial);
        equipment.setName(name);
        equipment.setDescription(description);
        equipment.setState(state);


        System.out.println("Se va a insertar un Equipo");

        int result=equipmentDao.saveEquipment(equipment);

        System.out.println("Se inserto un nuevo Equipo");

        return result;

    }

    public Equipment viewEquipment(String serial){

        Equipment equipment = new Equipment();

        System.out.println("Se va a consultar un paciente");

        equipment = equipmentDao.viewEquipment(serial);

        return equipment;

    }

    public void updateEquipment(String serial, String name, String description, String state){
        
        boolean cheek =equipmentDao.updateEquipment(serial,name,description,state);
        
        if (cheek == true){
                        System.out.println("Se se actualizao un Usuario");

        }
                        System.out.println("error");

    }

    public void deleteEquipment(String serial){
        equipmentDao.deleteEquipment(serial);
    }
}
