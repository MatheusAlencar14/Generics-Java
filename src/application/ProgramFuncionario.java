package application;

import entities.Funcionario;
import services.CalculationService;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProgramFuncionario {

    public static void main(String[] args) {

        List<Funcionario> list = new ArrayList<>();

        String path = "C:\\temp\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                String[] fd = line.split(",");
                list.add(new Funcionario(fd[0], Double.parseDouble(fd[1])));
                line = br.readLine();
            }

            Funcionario x = CalculationService.max(list);
            System.out.println("Maior salário: " + x);

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
