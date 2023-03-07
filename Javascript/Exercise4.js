function isMatrixDiagonal(matrix) {

    if (matrixSquare == false) return false;
    
    for (let i = 0; i <= matrix.length-1; i++) {
      for (let j = 0; j <= matrix[i].length-1; j++) {
        if (i !== j){
            if(matrix[i][j]!== 0){
                return false;
            }   
        }
      }
    }
    return true;
  }
  
function matrixSquare(matrix) {
    return matrix.length == matrix[0].length;
}
