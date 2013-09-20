package me.llss.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import me.llss.service.impl.CommentsServiceImpl;
import me.llss.service.impl.ContentsServiceImpl;
import me.llss.service.impl.LoginServiceImpl;
import me.llss.service.impl.MetasServiceImpl;
import me.llss.service.impl.OptionsServiceImpl;
import me.llss.service.impl.RelationshipsServiceImpl;
import me.llss.service.impl.UsersServiceImpl;
import me.llss.utils.Html2Text;
import me.llss.utils.MD5;

public class CommentsAction extends ActionSupport implements Action {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private RelationshipsServiceImpl rs = new RelationshipsServiceImpl();
	private ContentsServiceImpl cs = new ContentsServiceImpl();
	private CommentsServiceImpl cos = new CommentsServiceImpl();
	private MetasServiceImpl ms = new MetasServiceImpl();
	private OptionsServiceImpl os = new OptionsServiceImpl();
	private UsersServiceImpl us = new UsersServiceImpl();
	private int cid;
	private String author;
	private String text;
	private String mail;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}
	
	
}
