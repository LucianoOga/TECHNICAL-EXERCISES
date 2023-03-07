
//Given function
const mostrar = (param) => {
    param();
};

const mensaje = () => {
    console.log("Etendo!!!");
};
mostrar(mensaje);