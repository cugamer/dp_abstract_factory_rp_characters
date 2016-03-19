package charClasses;

import mainHand.MainHand;
import offHand.OffHand;
import rangeWep.RangeWep;
import armor.Armor;
import dp_abstract_factory_rp_characters.EquipmentFactory;
import headGear.HeadGear;
import accessory.Accessory;

public class Fighter implements Character {
	
	private String name;
	private EquipmentFactory equipmentFactory;
	private MainHand mainHand;
	private OffHand offHand;
	private RangeWep rangeWep;
	private Armor armor;
	private HeadGear headGear;
	private Accessory accessory;
	
	public Fighter(EquipmentFactory equipmentFactory, String name){
		this.name = name;
		this.equipmentFactory = equipmentFactory;
	}

	public void gearUp() {
		this.mainHand = equipmentFactory.createMainHand();
		this.offHand = equipmentFactory.createOffHand();
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

	public MainHand getMainHand() {
		return mainHand;
	}

	public String useMainHand() {
		return name + mainHand.action();
	}
	
	public String useOffHand(){
		return name + offHand.action();
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
