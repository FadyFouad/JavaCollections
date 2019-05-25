package com.etaTech.SetAndHashSet;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/****************************************************
 *** Created by Fady Fouad on 5/22/2019 at 15:46.***
 ***************************************************/

public abstract class HeavenlyBody {

    private final String name;
    private final double orbitalPeride ;
    private final Set<HeavenlyBody> sats;
    private final BodyType type;

    public enum BodyType {
        STAR ,
        MOON ,
        PLANET
    }

    public HeavenlyBody(String name, double orbitalPeride,BodyType type) {
        this.name = name;
        this.orbitalPeride = orbitalPeride;
        this.sats = new HashSet<>();
        this.type=type;
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeride() {
        return orbitalPeride;
    }

    public BodyType getType() {
        return type;
    }

    public boolean addSat(HeavenlyBody body){
        if (body.getType()==BodyType.MOON) {
            return this.sats.add(body);
        }else
            return false;
    }

    public Set<HeavenlyBody> getSats() {
        return new HashSet<>(sats);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeavenlyBody body = (HeavenlyBody) o;
        String obName = body.getName();
        return name.equals(obName);
    }

    @Override
    public int hashCode() {
//        System.out.println("hashCode : Called ");
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "HeavenlyBody{" +
                "name='" + name + '\'' +
                ", orbitalPeride=" + orbitalPeride +
                ", sats=" + sats +
                ", type=" + type +
                '}';
    }
    public static  final class Key{
        private String name;
        private HeavenlyBody body ;

        private Key(String name, HeavenlyBody body) {
            this.name = name;
            this.body = body;

        }

        public String getName() {
            return name;
        }

        public HeavenlyBody getBody() {
            return body;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || this.getClass() != o.getClass()) return false;
            Key key = (Key) o;
            if (this.name.equals(key.getName())){
                return this.getBody()==key.getBody();
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode()+this.body.hashCode();
        }
    }
}