package dp_abstract_factory_rp_characters;

import accessory.Accessory;
import armor.Armor;
import headGear.HeadGear;
import mainHand.MainHand;
import offHand.OffHand;
import rangeWep.RangeWep;
import robe.Robe;
import twoHand.TwoHand;

public interface EquipmentFactory {
	public MainHand createMainHand();
	public OffHand createOffHand();
	public RangeWep createRangeWep();
	public TwoHand createTwoHand();
	public Armor createArmor();
	public Robe createRobe();
	public HeadGear createHeadgear();
	public Accessory createAccessory();
}
