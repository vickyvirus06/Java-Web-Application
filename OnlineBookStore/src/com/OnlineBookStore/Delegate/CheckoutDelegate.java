package com.OnlineBookStore.Delegate;

import com.OnlineBookStore.DAO.BookDAO;
import com.OnlineBookStore.DAO.CheckOutDAO;
import com.OnlineBookStore.Factory.DAOFactory;
import com.OnlineBookStoreTO.Book;

public class CheckoutDelegate {

	
		
		static CheckOutDAO checkOutDAO=null;
		
		static{
			checkOutDAO=DAOFactory.getCheckOutDAO();
		}

		
		public  static String  clearData() {
			return checkOutDAO.clear();
		}


		
	}


