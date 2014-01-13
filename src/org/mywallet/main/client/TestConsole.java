package org.mywallet.main.client;

import org.mywallet.main.data.beans.Income;
import org.mywallet.main.service.TransactionServiceImpl;

public class TestConsole {

	public static void main(String[] args) {
		TransactionServiceImpl service = new TransactionServiceImpl();
		Income income = new Income();
		income.setCategory(1);
		income.setAmount(1000.0);
		income.setType(1);
		service.addTransaction(income);
	}

}
