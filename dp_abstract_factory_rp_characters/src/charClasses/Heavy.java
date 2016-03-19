package charClasses;

import accessory.Accessory;
import armor.Armor;
import dp_abstract_factory_rp_characters.EquipmentFactory;
import headGear.HeadGear;
import twoHand.TwoHand;

public class Heavy implements Character {
	private String name;
	private EquipmentFactory equipmentFactory;
	TwoHand twoHand;
	Armor armor;
	HeadGear headGear;
	Accessory accessory;
	
	public Heavy(EquipmentFactory equipmentFactory, String name){
		this.equipmentFactory = equipmentFactory;
		this.name = name;
	}
	
	public void gearUp() {
		this.twoHand = equipmentFactory.createTwoHand();
		this.armor = equipmentFactory.createArmor();
		this.headGear = equipmentFactory.createHeadgear();
		this.accessory = equipmentFactory.createAccessory();
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public String useTwoHand(){
		return name + twoHand.action();
	}
	
	public String useArmor(){
		return name + armor.action();
	}
	
	public String useHeadGear(){
		return name + headGear.action();
	}
	
	public String useAccessory(){
		return name + accessory.action();
	}

}
