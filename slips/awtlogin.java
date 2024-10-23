import java.awt.*;
import java.awt.event.*;
class Login extends Frame implements ActionListener{
	Label name,password;
	TextArea message;
	TextField tu,tp;
	Button login,clear;
	int attempCount=0;
	public Login(){
		setLayout(new FlowLayout());
		name=new Label("Username");
		password=new Label("Password");
		tu=new TextField(20);
		tp=new TextField(20);
		add(name);
		add(tu);
		add(password);
		add(tp);
		login=new Button("Login");
		login.addActionListener(this);
		clear=new Button("Clear");
		clear.addActionListener(this);
		add(login);
		add(clear);
		message=new TextArea(3,25);
		add(message);
		setTitle("Login");
		setSize(300,150);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource()==login){
			String username=tu.getText();
			String password=tp.getText();

			try{
				if(attempCount>=3){
					message.setText("Login attempts exceded");
				}
				if(username.equals(password)){
					message.setText("Login successful");
				}else{
					attempCount++;
					throw new Exception("Login failed attempts reamining:"+(3-attempCount));
				}
			}catch(Exception p){
				message.setText(p.getMessage());
			}
		}
		if(e.getSource()==clear){
			tu.setText("");
			tp.setText("");
		}
		if(attempCount>=3){
			login.setVisible(false);
		}
	}
}
class awtLogin{
	public static void main(String args[]){
		new Login();
	}
}
