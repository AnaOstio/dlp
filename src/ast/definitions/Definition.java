package ast.definitions;

import ast.ASTNode;
import ast.types.Type;

public interface Definition extends ASTNode {

    Type getType();
    void setType(Type type);

    String getName();
    void setName(String name);

    int getScope();
    void setScope(int scope);

}
