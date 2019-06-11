package Controller;

import Model.Usuario;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

public class Conexao {
    private ObjectContainer db = null;
            
    private void abrirBanco() {
        db = Db4oEmbedded.openFile("");
    }

    private void fecharBanco() {
	db.close();
    }
    
    public void insertUsuario(Usuario u) {
        abrirBanco();
        db.store(u);
        fecharBanco();
    }
}
