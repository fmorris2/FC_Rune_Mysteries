package scripts.fc.missions.fcrunemysteries.tasks;

import scripts.fc.api.items.FCItem;
import scripts.fc.missions.fcrunemysteries.FCRuneMysteries;
import scripts.fc.missions.fcrunemysteries.data.RMSettings;

public class SedridorThirdDialogue extends SedridorDialogue
{

	private static final long serialVersionUID = 7675076566579196488L;

	@Override
	public FCItem[] getRequiredItems()
	{
		return new FCItem[]
		{
			new FCItem(1, false, FCRuneMysteries.NOTES)
		};
	}

	@Override
	public boolean shouldExecute()
	{
		return RMSettings.SEDRIDOR_THIRD_DIALOGUE.isValid();
	}

	@Override
	public String getStatus()
	{
		return "Sedridor third dialogue";
	}

}
