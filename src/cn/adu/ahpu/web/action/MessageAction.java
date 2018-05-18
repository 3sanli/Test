package cn.adu.ahpu.web.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import cn.adu.ahpu.domain.Message;
import cn.adu.ahpu.domain.User;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class MessageAction extends ActionSupport implements Preparable{
	Message m = new Message();
	public String createMessage(){
		Map<String, Object> session = ActionContext.getContext().getSession();
		m.setUser_name(((User)session.get("user")).getUser_name());
		Map<String, Object> applicationScope = ActionContext.getContext().getApplication();
		List<Message> list = (List<Message>) applicationScope.get("messageList");
		if(list == null){
			list = new ArrayList<Message>();
		}
		list.add(m);
		applicationScope.put("messageList", list);
		return "showMessage";
	}	
	@Override
	public void prepare() throws Exception {
		ActionContext.getContext().getValueStack().push(m);
		
	}
}
