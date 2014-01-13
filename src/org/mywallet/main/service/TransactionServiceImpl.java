package org.mywallet.main.service;

import org.hibernate.Session;
import org.mywallet.main.data.beans.Transaction;

public class TransactionServiceImpl implements TransactionService {

	public void addTransaction(Transaction transaction) {
		SessionManager sessionManager = new SessionManager();
		Session session = sessionManager.getSession();
		session.beginTransaction();
		session.save(transaction);
		session.getTransaction().commit();
	}

}
