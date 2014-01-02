package de.tu_bs.cs.isf.mbse.cvclipse;

import com.google.common.base.Objects;
import de.tu_bs.cs.isf.mbse.cvclipse.Application;
import de.tu_bs.cs.isf.mbse.cvclipse.CV;
import de.tu_bs.cs.isf.mbse.cvclipse.Colors;
import de.tu_bs.cs.isf.mbse.cvclipse.Languages;
import de.tu_bs.cs.isf.mbse.cvclipse.ModelLoader;
import de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation;
import de.tu_bs.cs.isf.mbse.cvclipse.Styles;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public class M2T {
  private String DEFAULT_STYLE = "casual";
  
  private String DEFAULT_COLOR = "blue";
  
  private ModelLoader m = new Function0<ModelLoader>() {
    public ModelLoader apply() {
      ModelLoader _modelLoader = new ModelLoader();
      return _modelLoader;
    }
  }.apply();
  
  private Application app;
  
  private List<Languages> languages;
  
  private File targetFile;
  
  private FileOutputStream streamy;
  
  private String output;
  
  public void generate(final String folder, final String fileName) {
    try {
      Application _loadModel = this.m.loadModel(folder, fileName);
      this.app = _loadModel;
      EList<Languages> _languages = this.app.getLanguages();
      this.languages = _languages;
      for (final Languages l : this.languages) {
        {
          String _name = l.getName();
          String _lowerCase = _name.toLowerCase();
          String _plus = ((((folder + File.separator) + fileName) + "_") + _lowerCase);
          String _plus_1 = (_plus + ".tex");
          File _file = new File(_plus_1);
          this.targetFile = _file;
          this.targetFile.createNewFile();
          FileOutputStream _fileOutputStream = new FileOutputStream(this.targetFile);
          this.streamy = _fileOutputStream;
          String _generateContents = this.generateContents(l);
          String _replaceAll = _generateContents.replaceAll("\"", "");
          this.output = _replaceAll;
          byte[] _bytes = this.output.getBytes();
          this.streamy.write(_bytes);
          this.streamy.close();
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String generateContents(final Languages language) {
    StringConcatenation _builder = new StringConcatenation();
    String _generateHead = this.generateHead(language);
    _builder.append(_generateHead, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generatePersonal = this.generatePersonal(language);
    _builder.append(_generatePersonal, "");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String generateHead(final Languages language) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\documentclass[12pt,a4paper,sans]{moderncv}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\usepackage[utf8]{inputenc}");
    _builder.newLine();
    _builder.append("\\usepackage[T1]{fontenc}");
    _builder.newLine();
    _builder.append("\\usepackage[");
    String _literal = language.getLiteral();
    _builder.append(_literal, "");
    _builder.append("]{babel}");
    _builder.newLineIfNotEmpty();
    _builder.append("\\usepackage[scale=0.75]{geometry}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\moderncvstyle{");
    {
      Styles _style = this.app.getStyle();
      boolean _equals = Objects.equal(_style, null);
      if (_equals) {
        _builder.append(this.DEFAULT_STYLE, "");
      } else {
        Styles _style_1 = this.app.getStyle();
        String _literal_1 = _style_1.getLiteral();
        _builder.append(_literal_1, "");
      }
    }
    _builder.append("}");
    _builder.newLineIfNotEmpty();
    _builder.append("\\moderncvcolor{");
    {
      Colors _color = this.app.getColor();
      boolean _equals_1 = Objects.equal(_color, null);
      if (_equals_1) {
        _builder.append(this.DEFAULT_COLOR, "");
      } else {
        Colors _color_1 = this.app.getColor();
        String _literal_2 = _color_1.getLiteral();
        _builder.append(_literal_2, "");
      }
    }
    _builder.append("}");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String generatePersonal(final Languages languages) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\name{");
    PersonalInformation _personalInformation = this.app.getPersonalInformation();
    String _firstname = _personalInformation.getFirstname();
    _builder.append(_firstname, "");
    _builder.append("}{");
    PersonalInformation _personalInformation_1 = this.app.getPersonalInformation();
    String _surname = _personalInformation_1.getSurname();
    _builder.append(_surname, "");
    _builder.append("}");
    _builder.newLineIfNotEmpty();
    _builder.append("\\address{");
    PersonalInformation _personalInformation_2 = this.app.getPersonalInformation();
    String _street = _personalInformation_2.getStreet();
    _builder.append(_street, "");
    _builder.append("}{");
    PersonalInformation _personalInformation_3 = this.app.getPersonalInformation();
    String _city = _personalInformation_3.getCity();
    _builder.append(_city, "");
    _builder.append("}");
    _builder.newLineIfNotEmpty();
    {
      PersonalInformation _personalInformation_4 = this.app.getPersonalInformation();
      String _phone = _personalInformation_4.getPhone();
      boolean _notEquals = (!Objects.equal(_phone, null));
      if (_notEquals) {
        _builder.append("\\phone[fixed]{");
        PersonalInformation _personalInformation_5 = this.app.getPersonalInformation();
        String _phone_1 = _personalInformation_5.getPhone();
        _builder.append(_phone_1, "");
        _builder.append("}");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      PersonalInformation _personalInformation_6 = this.app.getPersonalInformation();
      String _mobile = _personalInformation_6.getMobile();
      boolean _notEquals_1 = (!Objects.equal(_mobile, null));
      if (_notEquals_1) {
        _builder.append("\\phone[mobile]{");
        PersonalInformation _personalInformation_7 = this.app.getPersonalInformation();
        String _mobile_1 = _personalInformation_7.getMobile();
        _builder.append(_mobile_1, "");
        _builder.append("}");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      PersonalInformation _personalInformation_8 = this.app.getPersonalInformation();
      String _fax = _personalInformation_8.getFax();
      boolean _notEquals_2 = (!Objects.equal(_fax, null));
      if (_notEquals_2) {
        _builder.append("\\phone[fax]{");
        PersonalInformation _personalInformation_9 = this.app.getPersonalInformation();
        String _fax_1 = _personalInformation_9.getFax();
        _builder.append(_fax_1, "");
        _builder.append("}");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      PersonalInformation _personalInformation_10 = this.app.getPersonalInformation();
      String _email = _personalInformation_10.getEmail();
      boolean _notEquals_3 = (!Objects.equal(_email, null));
      if (_notEquals_3) {
        _builder.append("\\email{");
        PersonalInformation _personalInformation_11 = this.app.getPersonalInformation();
        String _email_1 = _personalInformation_11.getEmail();
        _builder.append(_email_1, "");
        _builder.append("}");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      PersonalInformation _personalInformation_12 = this.app.getPersonalInformation();
      String _website = _personalInformation_12.getWebsite();
      boolean _notEquals_4 = (!Objects.equal(_website, null));
      if (_notEquals_4) {
        _builder.append("\\homepage{");
        PersonalInformation _personalInformation_13 = this.app.getPersonalInformation();
        String _website_1 = _personalInformation_13.getWebsite();
        _builder.append(_website_1, "");
        _builder.append("}");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      PersonalInformation _personalInformation_14 = this.app.getPersonalInformation();
      String _linkedIn = _personalInformation_14.getLinkedIn();
      boolean _notEquals_5 = (!Objects.equal(_linkedIn, null));
      if (_notEquals_5) {
        _builder.append("\\social[linkedin]{");
        PersonalInformation _personalInformation_15 = this.app.getPersonalInformation();
        String _linkedIn_1 = _personalInformation_15.getLinkedIn();
        _builder.append(_linkedIn_1, "");
        _builder.append("}");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      PersonalInformation _personalInformation_16 = this.app.getPersonalInformation();
      String _twitter = _personalInformation_16.getTwitter();
      boolean _notEquals_6 = (!Objects.equal(_twitter, null));
      if (_notEquals_6) {
        _builder.append("\\social[twitter]{");
        PersonalInformation _personalInformation_17 = this.app.getPersonalInformation();
        String _twitter_1 = _personalInformation_17.getTwitter();
        _builder.append(_twitter_1, "");
        _builder.append("}");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      PersonalInformation _personalInformation_18 = this.app.getPersonalInformation();
      String _github = _personalInformation_18.getGithub();
      boolean _notEquals_7 = (!Objects.equal(_github, null));
      if (_notEquals_7) {
        _builder.append("\\social[github]{");
        PersonalInformation _personalInformation_19 = this.app.getPersonalInformation();
        String _github_1 = _personalInformation_19.getGithub();
        _builder.append(_github_1, "");
        _builder.append("}");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      CV _cv = this.app.getCv();
      String _picture = _cv.getPicture();
      boolean _notEquals_8 = (!Objects.equal(_picture, null));
      if (_notEquals_8) {
        _builder.append("\\photo[64pt][0.4pt]{");
        CV _cv_1 = this.app.getCv();
        String _picture_1 = _cv_1.getPicture();
        _builder.append(_picture_1, "");
        _builder.append("}");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
}
