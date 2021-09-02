package controller;



import action.Action;
import action.EmailCheckAction;
import action.EmailCheckFormAction;
import action.ExhibitionDatailAction;
import action.ExhibitionListAction;
import action.ExhibitionFormAction;
import action.MainAction;
import action.MemberLoginAction;
import action.MemberLoginCheckAction;
import action.MemberLoginFormAction;
import action.MemberLogoutAction;
import action.MemberOkAction;
import action.MemberRegisterAction;

import action.MemberRegisterFormAction;

import action.PaymentAction;
import action.ReceiptAction;
import action.ReviewDeleteAction;
import action.ReviewDetailAction;
import action.ReviewListAction;
import action.ReviewWriteAction;
import action.ReviewWriteFormAction;
import action.ReviewUploadAction;

public class ActionFactory {
	private static ActionFactory instance = new ActionFactory();

	private ActionFactory() {
		super();
	}

	public static ActionFactory getInstance() {
		return instance;
	}

	public Action getAction(String command) {
		Action action = null;
		System.out.println("ActionFactory :" + command);
		if (command.equals("log")) {
			action = new MemberLoginAction();
		}
		if (command.equals("logOut")) {
			action = new MemberLogoutAction();
		}
		if (command.equals("logForm")) {
			action = new MemberLoginFormAction();
		}
		if (command.equals("logcheck")) {
			action = new MemberLoginCheckAction();
		}
		if (command.equals("main")) {
			action = new MainAction();
		}
		if (command.equals("memberok")) {
			action = new MemberOkAction();
		}
		if (command.equals("register")) {
			action = new MemberRegisterAction();
		}
		if (command.equals("registerForm")) {
			action = new MemberRegisterFormAction();
		}
		if (command.equals("reviewWriteForm")) {
			action = new ReviewWriteFormAction();
		}
		if (command.equals("reviewWrite")) {
			action = new ReviewWriteAction();
		}
		if (command.equals("reviewList")) {
			action = new ReviewListAction();
		}
		if (command.equals("reviewDetail")) {
			action = new ReviewDetailAction();
		}
		if (command.equals("reviewDelete")) {
			action = new ReviewDeleteAction();
		}
		if (command.equals("upload")) {
			action = new ReviewUploadAction();
		}
		if (command.equals("emailcheck")) {
			action = new EmailCheckAction();
		}
		if (command.equals("emailCheckForm")) {
			action = new EmailCheckFormAction();
		}
		if (command.equals("ExhibitionForm")) {
			action = new ExhibitionFormAction();
		}
		if (command.equals("Exhibition")) {
			action = new ExhibitionListAction();
		}
		if (command.equals("exDetail")) {
			action = new ExhibitionDatailAction();
		}
		if (command.equals("payment")) {
			action = new PaymentAction();
		}
		if (command.equals("receipt")) {
			action = new ReceiptAction();
		}
		return action;
}
}
