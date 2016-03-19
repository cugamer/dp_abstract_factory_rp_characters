package charClasses;

import accessory.Accessory;
import dp_abstract_factory_rp_characters.EquipmentFactory;
import rangeWep.RangeWep;

public class Ranger implements Character {
	String name;
	EquipmentFactory equipmentFactory;
	RangeWep rangeWep;
	Accessory accessory;
	
	public Ranger(EquipmentFactory equipmentFactory, String name){
		this.equipmentFactory = equipmentFactory;
		this.name = name;
	}
	
	
	public void gearUp() {
		this.rangeWep = equipmentFactory.createRangeWep();
		this.accessory = equipmentFactory.createAccessory();

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public String useRangeWep(){
		return name + rangeWep.action();
	}
	
	public String useAccessory(){
		return name + accessory.action();
	}

}
