package Documents;

import Documents.HumanResources.ICV;
import Documents.HumanResources.IContract;
/**
 *This class must be generic.
 *To inherit the methods of the different
 *created classes, tried to do "inheritance" by extending to different interfaceswithout 
 *success in implementation.
 **/
public class Document<T extends IOrder & IInvoice & IContract & ICV>  {
    
    private T typeDocument;

    public Document(T typeDocument) {
        this.typeDocument = typeDocument;
    }

    public T getDocumento() {
        return this.typeDocument;
    }

    public void setDocumento(T typeDocument) {
        this.typeDocument = typeDocument;
    }
}


