package pe.edu.ulima.itlab.memoriagame.model

class Board(numRows : Int, numCols : Int){
    var rows : Array<Array<BoxData>>

    init{
        rows = Array<Array<BoxData>>(numRows) { _ ->
            arrayOf()}
        for(i in 0..(numRows-1)){
            rows[i] = Array<BoxData>(numCols){ _ ->
                BoxData(Emoji.LION,false)}
        }
    }

    fun printBoard() {
        rows.forEach {
            it.forEach {
                print("${it.emoji} ")
            }
            println()
        }
    }

    fun setValue(posRow:Int, posCol:Int, value:BoxData){
        rows[posRow][posCol] = value
    }

    fun getValue(posRow:Int, posCol:Int):BoxData?{
        if ( posRow >= rows.size)return null
        if ( posCol >= rows[0].size)return null
        if (posCol<0 || posRow<0)return null
        return rows[posRow][posCol]
    }
}