/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arboles;
/**
 *
 * @author Abigail
 */
public class arbol
{
    nodo raiz=null;
    public boolean tieneraiz()
    {
        if(raiz==null) return false;
        else return true;
    }
 
    public arbol alta(int dat)
    {
        if(!tieneraiz())
        {
            nodo nuevo=new nodo(dat);
            raiz=nuevo;
        }
        else
        {
            boolean izq;
            nodo actual=raiz;
            while(true)
            {
                if(actual.dato<dat) izq=false;
                else izq=true;
                if(!izq)
                {
                    if(actual.der==null)
                    {
                        nodo nuevo=new nodo(dat);
                        actual.der=nuevo;
                        break;
                    }
                    else actual=actual.der;
                }
                else
                {
                    if(actual.izq==null)
                    {
                        nodo nuevo=new nodo(dat);
                        actual.izq=nuevo;
                        break;
                    }
                    else actual=actual.izq;
                }
            }
        }return this;
    }
 
    public boolean baja(int dat)
    {
        nodo actual=raiz, anterior=raiz, temp;
        while(true)
        {
            if(actual==null) break;
            if(actual.dato==dat) break;
            anterior=actual;
            if(actual.dato<dat) actual=actual.der;
            else actual=actual.der;
        }
        if(actual==null) return false;
        else
        {
            if(actual==raiz)
            {
                temp=actual.izq;
                raiz=raiz.der;
                anterior=raiz;
            }
            else
            if (anterior.der == actual)
            {
                temp=actual.izq;
                anterior=actual.der;
            }
            else
            {
             temp=actual.izq;
             anterior.der=actual.izq;
            }
//            actual=new nodo();
            while(actual.izq!=null)
                actual=actual.izq;
            actual.izq=temp;
            return true;
        }
    }
 
    public String imprimirpreorden()
    {
        return ayudantePreorden(raiz);
    }
 
    public String ayudantePreorden(nodo dat)
    {
        String h="";
        if(dat==null)
                return h;
        h+=(dat.dato+", ");
        h+=ayudantePreorden(dat.izq);
        h+=ayudantePreorden(dat.der);
        return h;
        
    }
    
    public String imprimirInorden()
    {
    	return ayudanteInorden(raiz);
    }
    
    public String ayudanteInorden(nodo dat)
    {
        
        String h="";
        if(dat==null)
                return h;
            h+=ayudanteInorden(dat.izq);
            h+=(dat.dato+", ");
            h+=ayudanteInorden(dat.der);
            return h;
        
    }
    public String imprimirPostorden()
    {
    	return ayudantePostorden(raiz);
    }
    
    public String ayudantePostorden(nodo dat)
    {
        String h="";
        if(dat==null)
            return h;
            h+=ayudantePostorden(dat.izq);
            h+=ayudantePostorden(dat.der);
            h+=(dat.dato+", ");
            return h;
    }

}