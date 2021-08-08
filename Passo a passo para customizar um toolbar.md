Passo a passo para customizar* um toolbar:

1. Crie um projeto (empty activity foi o que usamos no tutorial)
2. Troca no estilo
   1. Vá em res/values/styles.xml
   2. Linha 3 tem o nome do style, no fim da linha antes de fechar a dev tire o que estiver no último ponto, o "DarkActionBar" , e ponha "NoActionBar"
      - Pode ser que tenha dois arquivos thenes, um para tema dia e outro escuro.. altere os dois se essa toolbar for a que deve estar nos dois momentos
3. Criar novo layout para a nova tool bar
   1. Clique com a direita no res/layout e vá até new/Layout resource file
   2. Dê o nome que quiser para esse elemento
   3. Na linha root elemente DIGITE Toolbar (vai autocompletar quando começar a digitar)
   4. Escolha a opção que tem "androidx.app.compat.widget.Toobar" - essa linha será a que vamos usar nas importações, tem outra do android mas não é essa.
4. Criando o layout
   1. Vá na edição do layout novo  e mude para code e deixe o split ativo
   2. Certifique-se que a opção de android:layout_height = "?attr/actionBarSize" seja a que está ativa
   3.  A cor do nosso toolbar está branco e por isso não dá pra ver no layout use:
      - android:background="@color/xxxxxx" escolha a cor que quiser
   4. Add o id da toolbar: android:id="@+id/xxxxxxx" coloque o nome que quiser
   5. Escolha o tema: android:theme="OOOOOOOOOOOOOO"
      - Vá na linha xmlns:android e copie a linha toda
      - Cole logo abaixo
      - Troque xmlns:android por xmlns:app
      - No fim da nova linha tire /android e coloque -auto
      - Adicione a liha android:theme="OOOOOOOOOOOOOO e escolha o tema que quiser
      - No tutorial foi @style/ThemeOverlay.AppCompat.Dark
5. Feche a dev com um maior >
6. Vá ao codigo da main activity
7.  Delete o texto que veio no layout padrão, se vier... no meu não veio...
8. Digite numa linha depois do acima: <include
9. Na linha debaixo: layout="@layout/appbar"/>  <= appbar é o nome desse layout!!! Troque para o seu! 
   - Pode ser que fique sublinhado vermelho no  meu ele importou uma linha nova de xmlns e resolveu.
10. Ativar esse toolbar na activity:
    1. Vai no codigo da activity
    2. Certifique-se que a class principal extends AppCompatActivity
    3. Dentro da class crie a linha private Toolbar toolbar;
    4. Dentro do onCreate adicione a linha: val toolbar=findViewById(R.id.myTooBar) <= Troque o nome para o id que vc escolheu
    5. Ele vai importar sozinho a toolbar, certifique-se que foi import androidx.appcompat.widget.Toolbar
    6. Dentro de onCreate adicione a linha: setSupportActionBar(toolbar)



*Então, o tema padrão do adroid já possui uma toolbar padrão, portanto aqui estamos sobrescrevendo uma.

