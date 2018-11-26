 
 
 /** Interface Switch case com Do While **/
 
 
 String opcao = "";

        do {
            opcao = JOptionPane.showInputDialog("###TITULO###\r\n"
                    + "\r\n1) Opcao1"
                    + "\r\n2) Opcao2"
                    + "\r\n3) Opcao3"
                    + "\r\n4) Opcao4 "
                    + "\r\n0) Sair\r\n");
            switch (opcao) {
                case "1": // Opcao 1 //

                    break;

                case "2": // Opcao 2 //

                    break;

                case "3": // Opcao 3 //

                    break;

                case "4": // Opcao 4 //

                    break;
            }
        } while (!opcao.equals("0"));