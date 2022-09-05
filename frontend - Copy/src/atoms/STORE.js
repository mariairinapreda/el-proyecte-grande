import {atom} from "jotai";

export const USER = atom({token: undefined, id: undefined, name: undefined})

export const BASE_PATH = "http://localhost:8888";