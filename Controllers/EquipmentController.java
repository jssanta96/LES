package Controllers;

import Dao.EquipmentDao;
import Logica.Equipment;
import Logica.View;

public class EquipmentController {

    public EquipmentController(){
    }

    public int addEquipment(String serial, String name, String description, String state){
        
        Equipment equipment= new Equipment();
        EquipmentDao equipmentDao= new EquipmentDao();
        
        equipment.setSerial(serial);
        equipment.setName(name);
        equipment.setDescription(description);
        equipment.setState(state);
        
        int result=equipmentDao.saveEquipment(equipment);

        if (result == 1){
                View message = new View();
                message.sucessfulOperationTypeElement("Un equipo" , "creado");
                return result;
        }else{
            View message = new View();
            message.errorCreateTypeElement();
        }
        return 0;

    }

    public Equipment viewEquipment(String serial){

        Equipment equipment = new Equipment();
        EquipmentDao equipmentDao= new EquipmentDao();
        
        equipment = equipmentDao.viewEquipment(serial);

        return equipment;

    }

    public void updateEquipment(String serial, String name, String description, String state){
        
        EquipmentDao equipmentDao= new EquipmentDao();
        
        boolean cheek =equipmentDao.updateEquipment(serial,name,description,state);
        
        if (cheek == true){
                View message = new View();
                message.sucessfulOperationTypeElement("Un equipo", "actualizado");
        }

    }
    
    public void setStateEquipment(int id_equipment,String state){
        
        EquipmentDao equipmentDao= new EquipmentDao();
        
        boolean cheek =equipmentDao.changeStateEquipment(id_equipment,state);
        
        if (cheek == true){
                        System.out.println("Se actualizo el estado de un equipo ");

        }
    }

}
