package reddy.flip2.web.login;

import br.com.jarch.annotation.JArchViewScoped;
import br.com.jarch.faces.controller.BaseLoginController;
import br.com.jarch.model.IUser;
import br.com.jarch.model.UserSystem;

@JArchViewScoped
public class LoginController extends BaseLoginController {

    @Override
    public IUser processLogin() {
        return new UserSystem();
    }

    @Override
    public void forgotPassword(String s) {

    }
}