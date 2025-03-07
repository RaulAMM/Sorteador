package br.edu.br.ifsp.dmo.sorteador.model

object DefaultLimit : SorteioStrategy() {
    private val BORDER_DEFAULT = 1000
    override fun nextNumber(): Int {
        return random.nextInt(1, BORDER_DEFAULT + 1)
    }

    override fun getLowBorder(): Int {
        return 1
    }

    override fun getHighBorer(): Int {
        return BORDER_DEFAULT
    }

}