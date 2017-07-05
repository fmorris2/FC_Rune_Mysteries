package scripts.fc.missions.fcrunemysteries.data;

import java.util.Arrays;

import scripts.fc.framework.quest.InvBankBool;
import scripts.fc.framework.quest.Order;
import scripts.fc.framework.quest.QuestState;
import scripts.fc.framework.quest.SettingBool;
import scripts.fc.missions.fcrunemysteries.FCRuneMysteries;

public enum RMSettings
{
	DUKE_HORACIO_DIALOGUE
	(
		new QuestState
		(
			new SettingBool(FCRuneMysteries.SETTING, 0, true, Order.EQUALS)
				.or(new InvBankBool(FCRuneMysteries.AIR_TALISMAN, 1, InvBankBool.TYPE.NOT_IN_EITHER, true)
					.and(new SettingBool(FCRuneMysteries.SETTING, 1, true, Order.EQUALS)))
		)
	),
	
	SEDRIDOR_FIRST_DIALOGUE
	(
		new QuestState
		(
			new SettingBool(FCRuneMysteries.SETTING, 1, true, Order.EQUALS),
			new InvBankBool(FCRuneMysteries.AIR_TALISMAN, 1, InvBankBool.TYPE.IN_ONE, true)
		)
	),
	
	SEDRIDOR_SECOND_DIALOGUE
	(
		new QuestState
		(
			new SettingBool(FCRuneMysteries.SETTING, 2, true, Order.EQUALS)
				.or(new InvBankBool(FCRuneMysteries.RESEARCH_PACKAGE, 1, InvBankBool.TYPE.NOT_IN_EITHER, true)
					.and(new SettingBool(FCRuneMysteries.SETTING, 3, true, Order.EQUALS)))
		)
	),
	
	AUBURY_FIRST_DIALOGUE
	(
		new QuestState
		(
			new SettingBool(FCRuneMysteries.SETTING, 3, true, Order.EQUALS),
			new InvBankBool(FCRuneMysteries.RESEARCH_PACKAGE, 1, InvBankBool.TYPE.IN_ONE, true)
		)
	),
	
	AUBURY_SECOND_DIALOGUE
	(
		new QuestState
		(
			new SettingBool(FCRuneMysteries.SETTING, 4, true, Order.EQUALS)
				.or(new InvBankBool(FCRuneMysteries.NOTES, 1, InvBankBool.TYPE.NOT_IN_EITHER, true)
					.and(new SettingBool(FCRuneMysteries.SETTING, 5, true, Order.EQUALS)))
		
		)
	),
	
	SEDRIDOR_THIRD_DIALOGUE
	(
		new QuestState
		(
			new SettingBool(FCRuneMysteries.SETTING, 5, true, Order.EQUALS),
			new InvBankBool(FCRuneMysteries.NOTES, 1, InvBankBool.TYPE.IN_ONE, true)
		)
	),
	
	QUEST_FINISHED
	(
		new QuestState
		(
			new SettingBool(FCRuneMysteries.SETTING, 6, true, Order.AFTER_EQUALS)
		)
	);
	
	private QuestState[] states;
	
	RMSettings(QuestState... states)
	{
		this.states = states;
	}
	
	public boolean isValid()
	{
		return Arrays.stream(states).allMatch(s -> s.validate());
	}
}
