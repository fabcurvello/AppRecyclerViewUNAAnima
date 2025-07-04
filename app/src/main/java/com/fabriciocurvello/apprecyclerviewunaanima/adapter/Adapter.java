package com.fabriciocurvello.apprecyclerviewunaanima.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.fabriciocurvello.apprecyclerviewunaanima.R;
import com.fabriciocurvello.apprecyclerviewunaanima.model.Disciplina;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Disciplina> listaDisciplinas;

    public Adapter(List<Disciplina> lista) {
        this.listaDisciplinas = lista;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Cria a visualização dos itens da lista
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista, parent, false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        //Exibe os itens da lista
        Disciplina d = listaDisciplinas.get( position );
        holder.disciplina.setText( d.getNomeDisciplina() );
        holder.professor.setText( d.getProfessor() );
        holder.diaSemana.setText( d.getDiaSemana() );
        holder.sala.setText( d.getSala() );
    }

    @Override
    public int getItemCount() {
        //Quantidade de itens a ser exibida
        return listaDisciplinas.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView disciplina;
        TextView professor;
        TextView diaSemana;
        TextView sala;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            disciplina = itemView.findViewById(R.id.tv_disciplina);
            professor = itemView.findViewById(R.id.tv_professor);
            diaSemana = itemView.findViewById(R.id.tv_dia_semana);
            sala = itemView.findViewById(R.id.tv_sala);
        }
    }
}
